/**
 */
package DDDRootElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see DDDRootElement.DDDRootElementFactory
 * @model kind="package"
 * @generated
 */
public interface DDDRootElementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DDDRootElement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.swfactory.ddd.profile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DDDRootElement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DDDRootElementPackage eINSTANCE = DDDRootElement.impl.DDDRootElementPackageImpl.init();

	/**
	 * The meta object id for the '{@link DDDRootElement.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DDDRootElement.impl.EntityImpl
	 * @see DDDRootElement.impl.DDDRootElementPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DDDRootElement.impl.AggregateRootImpl <em>Aggregate Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DDDRootElement.impl.AggregateRootImpl
	 * @see DDDRootElement.impl.DDDRootElementPackageImpl#getAggregateRoot()
	 * @generated
	 */
	int AGGREGATE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ROOT__BASE_CLASS = ENTITY__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Aggregate Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ROOT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aggregate Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_ROOT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DDDRootElement.impl.AggregateImpl <em>Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DDDRootElement.impl.AggregateImpl
	 * @see DDDRootElement.impl.DDDRootElementPackageImpl#getAggregate()
	 * @generated
	 */
	int AGGREGATE = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__BASE_CLASS = ENTITY__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DDDRootElement.impl.IdentityImpl <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DDDRootElement.impl.IdentityImpl
	 * @see DDDRootElement.impl.DDDRootElementPackageImpl#getIdentity()
	 * @generated
	 */
	int IDENTITY = 3;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__GENERATED = 1;

	/**
	 * The number of structural features of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DDDRootElement.impl.ValueObjectImpl <em>Value Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DDDRootElement.impl.ValueObjectImpl
	 * @see DDDRootElement.impl.DDDRootElementPackageImpl#getValueObject()
	 * @generated
	 */
	int VALUE_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DDDRootElement.impl.DTOImpl <em>DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DDDRootElement.impl.DTOImpl
	 * @see DDDRootElement.impl.DDDRootElementPackageImpl#getDTO()
	 * @generated
	 */
	int DTO = 5;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DDDRootElement.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DDDRootElement.impl.RepositoryImpl
	 * @see DDDRootElement.impl.DDDRootElementPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 6;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DDDRootElement.impl.BoundedContextImpl <em>Bounded Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DDDRootElement.impl.BoundedContextImpl
	 * @see DDDRootElement.impl.DDDRootElementPackageImpl#getBoundedContext()
	 * @generated
	 */
	int BOUNDED_CONTEXT = 7;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Bounded Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bounded Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link DDDRootElement.AggregateRoot <em>Aggregate Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Root</em>'.
	 * @see DDDRootElement.AggregateRoot
	 * @generated
	 */
	EClass getAggregateRoot();

	/**
	 * Returns the meta object for class '{@link DDDRootElement.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see DDDRootElement.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference '{@link DDDRootElement.Entity#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see DDDRootElement.Entity#getBase_Class()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Base_Class();

	/**
	 * Returns the meta object for class '{@link DDDRootElement.Aggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate</em>'.
	 * @see DDDRootElement.Aggregate
	 * @generated
	 */
	EClass getAggregate();

	/**
	 * Returns the meta object for class '{@link DDDRootElement.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see DDDRootElement.Identity
	 * @generated
	 */
	EClass getIdentity();

	/**
	 * Returns the meta object for the reference '{@link DDDRootElement.Identity#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see DDDRootElement.Identity#getBase_Property()
	 * @see #getIdentity()
	 * @generated
	 */
	EReference getIdentity_Base_Property();

	/**
	 * Returns the meta object for the attribute '{@link DDDRootElement.Identity#isGenerated <em>Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated</em>'.
	 * @see DDDRootElement.Identity#isGenerated()
	 * @see #getIdentity()
	 * @generated
	 */
	EAttribute getIdentity_Generated();

	/**
	 * Returns the meta object for class '{@link DDDRootElement.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Object</em>'.
	 * @see DDDRootElement.ValueObject
	 * @generated
	 */
	EClass getValueObject();

	/**
	 * Returns the meta object for the reference '{@link DDDRootElement.ValueObject#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see DDDRootElement.ValueObject#getBase_Class()
	 * @see #getValueObject()
	 * @generated
	 */
	EReference getValueObject_Base_Class();

	/**
	 * Returns the meta object for class '{@link DDDRootElement.DTO <em>DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO</em>'.
	 * @see DDDRootElement.DTO
	 * @generated
	 */
	EClass getDTO();

	/**
	 * Returns the meta object for the reference '{@link DDDRootElement.DTO#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see DDDRootElement.DTO#getBase_Class()
	 * @see #getDTO()
	 * @generated
	 */
	EReference getDTO_Base_Class();

	/**
	 * Returns the meta object for class '{@link DDDRootElement.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see DDDRootElement.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the reference '{@link DDDRootElement.Repository#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see DDDRootElement.Repository#getBase_Class()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Base_Class();

	/**
	 * Returns the meta object for class '{@link DDDRootElement.BoundedContext <em>Bounded Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Context</em>'.
	 * @see DDDRootElement.BoundedContext
	 * @generated
	 */
	EClass getBoundedContext();

	/**
	 * Returns the meta object for the reference '{@link DDDRootElement.BoundedContext#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see DDDRootElement.BoundedContext#getBase_Package()
	 * @see #getBoundedContext()
	 * @generated
	 */
	EReference getBoundedContext_Base_Package();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DDDRootElementFactory getDDDRootElementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link DDDRootElement.impl.AggregateRootImpl <em>Aggregate Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DDDRootElement.impl.AggregateRootImpl
		 * @see DDDRootElement.impl.DDDRootElementPackageImpl#getAggregateRoot()
		 * @generated
		 */
		EClass AGGREGATE_ROOT = eINSTANCE.getAggregateRoot();

		/**
		 * The meta object literal for the '{@link DDDRootElement.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DDDRootElement.impl.EntityImpl
		 * @see DDDRootElement.impl.DDDRootElementPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__BASE_CLASS = eINSTANCE.getEntity_Base_Class();

		/**
		 * The meta object literal for the '{@link DDDRootElement.impl.AggregateImpl <em>Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DDDRootElement.impl.AggregateImpl
		 * @see DDDRootElement.impl.DDDRootElementPackageImpl#getAggregate()
		 * @generated
		 */
		EClass AGGREGATE = eINSTANCE.getAggregate();

		/**
		 * The meta object literal for the '{@link DDDRootElement.impl.IdentityImpl <em>Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DDDRootElement.impl.IdentityImpl
		 * @see DDDRootElement.impl.DDDRootElementPackageImpl#getIdentity()
		 * @generated
		 */
		EClass IDENTITY = eINSTANCE.getIdentity();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTITY__BASE_PROPERTY = eINSTANCE.getIdentity_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Generated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTITY__GENERATED = eINSTANCE.getIdentity_Generated();

		/**
		 * The meta object literal for the '{@link DDDRootElement.impl.ValueObjectImpl <em>Value Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DDDRootElement.impl.ValueObjectImpl
		 * @see DDDRootElement.impl.DDDRootElementPackageImpl#getValueObject()
		 * @generated
		 */
		EClass VALUE_OBJECT = eINSTANCE.getValueObject();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_OBJECT__BASE_CLASS = eINSTANCE.getValueObject_Base_Class();

		/**
		 * The meta object literal for the '{@link DDDRootElement.impl.DTOImpl <em>DTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DDDRootElement.impl.DTOImpl
		 * @see DDDRootElement.impl.DDDRootElementPackageImpl#getDTO()
		 * @generated
		 */
		EClass DTO = eINSTANCE.getDTO();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO__BASE_CLASS = eINSTANCE.getDTO_Base_Class();

		/**
		 * The meta object literal for the '{@link DDDRootElement.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DDDRootElement.impl.RepositoryImpl
		 * @see DDDRootElement.impl.DDDRootElementPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__BASE_CLASS = eINSTANCE.getRepository_Base_Class();

		/**
		 * The meta object literal for the '{@link DDDRootElement.impl.BoundedContextImpl <em>Bounded Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DDDRootElement.impl.BoundedContextImpl
		 * @see DDDRootElement.impl.DDDRootElementPackageImpl#getBoundedContext()
		 * @generated
		 */
		EClass BOUNDED_CONTEXT = eINSTANCE.getBoundedContext();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED_CONTEXT__BASE_PACKAGE = eINSTANCE.getBoundedContext_Base_Package();

	}

} //DDDRootElementPackage
