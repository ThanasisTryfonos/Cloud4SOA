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

package eu.cloud4soa.frontend.commons.client.datamodel.frontend.metadata;

import com.google.gwt.user.client.rpc.IsSerializable;
import eu.cloud4soa.frontend.commons.client.Strings;
import eu.cloud4soa.frontend.commons.client.datamodel.frontend.EntityMetadata;
import eu.cloud4soa.frontend.commons.client.datamodel.frontend.FieldMetadata;

import static eu.cloud4soa.frontend.commons.client.datamodel.frontend.EditType.CHECKBOX;
import static eu.cloud4soa.frontend.commons.client.datamodel.frontend.EditType.COMBOBOX;
import static eu.cloud4soa.frontend.commons.client.datamodel.frontend.FieldMetadata.COMBO_SOFTWARE_CATEGORY;
import static eu.cloud4soa.frontend.commons.client.datamodel.frontend.application.RangeModel.REQUIRED;
import static eu.cloud4soa.frontend.commons.client.datamodel.frontend.application.SoftwareComponentModel.SOFTWARE_CATEGORY;

/**
 * Define the software component form in the application editor
 *
 * @author Stefano Travelli (Cyntelix)
 */
public class ApplicationEditorSoftwareGenericMetadata extends EntityMetadata implements IsSerializable {

    public ApplicationEditorSoftwareGenericMetadata() {
        field(FieldMetadata.create(SOFTWARE_CATEGORY)
                .label("Category")
                .editType(COMBOBOX)
                .tooltip("Computation component category")
                .relatedEntityType(COMBO_SOFTWARE_CATEGORY)
        );

        field(FieldMetadata.create(REQUIRED)
                .label(Strings.EMPTY)
                .boxLabel("Software component is required.")
                .editType(CHECKBOX)
                .tooltip("Check if this software component is required.")
        );

    }
}
