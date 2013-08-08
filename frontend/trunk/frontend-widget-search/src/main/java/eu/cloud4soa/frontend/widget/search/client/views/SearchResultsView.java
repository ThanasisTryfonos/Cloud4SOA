/*
 * This file is part of Cloud4SOA Frontend.
 *
 *     Cloud4SOA Frontend is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Cloud4SOA Frontend is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Cloud4SOA Frontend.  If not, see <http://www.gnu.org/licenses/>.
 */

package eu.cloud4soa.frontend.widget.search.client.views;

import java.util.List;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.IsWidget;

import eu.cloud4soa.frontend.commons.client.datamodel.frontend.paas.PaaSOfferingModel;
import eu.cloud4soa.frontend.commons.client.datamodel.frontend.sla.SLATemplateModel;

public interface SearchResultsView extends IsWidget{
	void setPresenter(Presenter presenter);
	Presenter getPresenter();
	void setPaaSOfferingResults(List<PaaSOfferingModel> dataProvider);
	void showResultsContainer(boolean show);
	void showPaaSOfferingDetails (PaaSOfferingModel paaSOffering);

    public interface Presenter {
        void goTo(Place place);
		void addDataDisplay(CellTable<PaaSOfferingModel> ctPaaSOffers);
		void onPaaSOfferingSelected (PaaSOfferingModel paasOffering);
		void onPaaSOfferingDetailsRequested (PaaSOfferingModel paasOffering);
    }
	
}
