/*
 * Copyright [2013] [Cloud4SOA, www.cloud4soa.eu]
 *
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


/**
 * <copyright>
 * </copyright>
 *
 */
package eu.cloud4soa.xtext.dsl.impl;

import eu.cloud4soa.xtext.dsl.DslPackage;
import eu.cloud4soa.xtext.dsl.StorageComponent;
import eu.cloud4soa.xtext.dsl.StorageResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.cloud4soa.xtext.dsl.impl.StorageResourceImpl#getStorageComponent <em>Storage Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StorageResourceImpl extends MinimalEObjectImpl.Container implements StorageResource
{
  /**
   * The cached value of the '{@link #getStorageComponent() <em>Storage Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorageComponent()
   * @generated
   * @ordered
   */
  protected StorageComponent storageComponent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StorageResourceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DslPackage.Literals.STORAGE_RESOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StorageComponent getStorageComponent()
  {
    return storageComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStorageComponent(StorageComponent newStorageComponent, NotificationChain msgs)
  {
    StorageComponent oldStorageComponent = storageComponent;
    storageComponent = newStorageComponent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.STORAGE_RESOURCE__STORAGE_COMPONENT, oldStorageComponent, newStorageComponent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStorageComponent(StorageComponent newStorageComponent)
  {
    if (newStorageComponent != storageComponent)
    {
      NotificationChain msgs = null;
      if (storageComponent != null)
        msgs = ((InternalEObject)storageComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.STORAGE_RESOURCE__STORAGE_COMPONENT, null, msgs);
      if (newStorageComponent != null)
        msgs = ((InternalEObject)newStorageComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.STORAGE_RESOURCE__STORAGE_COMPONENT, null, msgs);
      msgs = basicSetStorageComponent(newStorageComponent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.STORAGE_RESOURCE__STORAGE_COMPONENT, newStorageComponent, newStorageComponent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DslPackage.STORAGE_RESOURCE__STORAGE_COMPONENT:
        return basicSetStorageComponent(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DslPackage.STORAGE_RESOURCE__STORAGE_COMPONENT:
        return getStorageComponent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.STORAGE_RESOURCE__STORAGE_COMPONENT:
        setStorageComponent((StorageComponent)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.STORAGE_RESOURCE__STORAGE_COMPONENT:
        setStorageComponent((StorageComponent)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.STORAGE_RESOURCE__STORAGE_COMPONENT:
        return storageComponent != null;
    }
    return super.eIsSet(featureID);
  }

} //StorageResourceImpl