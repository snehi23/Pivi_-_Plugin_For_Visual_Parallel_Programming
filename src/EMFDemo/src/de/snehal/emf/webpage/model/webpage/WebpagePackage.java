/**
 */
package de.snehal.emf.webpage.model.webpage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see de.snehal.emf.webpage.model.webpage.WebpageFactory
 * @model kind="package"
 * @generated
 */
public interface WebpagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webpage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/webpage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webpage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebpagePackage eINSTANCE = de.snehal.emf.webpage.model.webpage.impl.WebpagePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.snehal.emf.webpage.model.webpage.impl.WebImpl <em>Web</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.snehal.emf.webpage.model.webpage.impl.WebImpl
	 * @see de.snehal.emf.webpage.model.webpage.impl.WebpagePackageImpl#getWeb()
	 * @generated
	 */
	int WEB = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__PAGES = 3;

	/**
	 * The number of structural features of the '<em>Web</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Web</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.snehal.emf.webpage.model.webpage.impl.WebPageImpl <em>Web Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.snehal.emf.webpage.model.webpage.impl.WebPageImpl
	 * @see de.snehal.emf.webpage.model.webpage.impl.WebpagePackageImpl#getWebPage()
	 * @generated
	 */
	int WEB_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__KEYWORDS = 3;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__CATEGORIES = 4;

	/**
	 * The number of structural features of the '<em>Web Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Web Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.snehal.emf.webpage.model.webpage.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.snehal.emf.webpage.model.webpage.impl.CategoryImpl
	 * @see de.snehal.emf.webpage.model.webpage.impl.WebpagePackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Articles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ARTICLES = 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.snehal.emf.webpage.model.webpage.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.snehal.emf.webpage.model.webpage.impl.ArticleImpl
	 * @see de.snehal.emf.webpage.model.webpage.impl.WebpagePackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Calender</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Calendar
	 * @see de.snehal.emf.webpage.model.webpage.impl.WebpagePackageImpl#getCalender()
	 * @generated
	 */
	int CALENDER = 4;


	/**
	 * Returns the meta object for class '{@link de.snehal.emf.webpage.model.webpage.Web <em>Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web</em>'.
	 * @see de.snehal.emf.webpage.model.webpage.Web
	 * @generated
	 */
	EClass getWeb();

	/**
	 * Returns the meta object for the attribute '{@link de.snehal.emf.webpage.model.webpage.Web#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.snehal.emf.webpage.model.webpage.Web#getName()
	 * @see #getWeb()
	 * @generated
	 */
	EAttribute getWeb_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.snehal.emf.webpage.model.webpage.Web#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.snehal.emf.webpage.model.webpage.Web#getTitle()
	 * @see #getWeb()
	 * @generated
	 */
	EAttribute getWeb_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.snehal.emf.webpage.model.webpage.Web#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.snehal.emf.webpage.model.webpage.Web#getDescription()
	 * @see #getWeb()
	 * @generated
	 */
	EAttribute getWeb_Description();

	/**
	 * Returns the meta object for the reference list '{@link de.snehal.emf.webpage.model.webpage.Web#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pages</em>'.
	 * @see de.snehal.emf.webpage.model.webpage.Web#getPages()
	 * @see #getWeb()
	 * @generated
	 */
	EReference getWeb_Pages();

	/**
	 * Returns the meta object for class '{@link de.snehal.emf.webpage.model.webpage.WebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Page</em>'.
	 * @see de.snehal.emf.webpage.model.webpage.WebPage
	 * @generated
	 */
	EClass getWebPage();

	/**
	 * Returns the meta object for the attribute '{@link de.snehal.emf.webpage.model.webpage.WebPage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.snehal.emf.webpage.model.webpage.WebPage#getName()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.snehal.emf.webpage.model.webpage.WebPage#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.snehal.emf.webpage.model.webpage.WebPage#getTitle()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.snehal.emf.webpage.model.webpage.WebPage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.snehal.emf.webpage.model.webpage.WebPage#getDescription()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.snehal.emf.webpage.model.webpage.WebPage#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keywords</em>'.
	 * @see de.snehal.emf.webpage.model.webpage.WebPage#getKeywords()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_Keywords();

	/**
	 * Returns the meta object for the containment reference list '{@link de.snehal.emf.webpage.model.webpage.WebPage#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see de.snehal.emf.webpage.model.webpage.WebPage#getCategories()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_Categories();

	/**
	 * Returns the meta object for class '{@link de.snehal.emf.webpage.model.webpage.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see de.snehal.emf.webpage.model.webpage.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link de.snehal.emf.webpage.model.webpage.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.snehal.emf.webpage.model.webpage.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.snehal.emf.webpage.model.webpage.Category#getArticles <em>Articles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Articles</em>'.
	 * @see de.snehal.emf.webpage.model.webpage.Category#getArticles()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Articles();

	/**
	 * Returns the meta object for class '{@link de.snehal.emf.webpage.model.webpage.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see de.snehal.emf.webpage.model.webpage.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for the attribute '{@link de.snehal.emf.webpage.model.webpage.Article#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.snehal.emf.webpage.model.webpage.Article#getName()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Name();

	/**
	 * Returns the meta object for data type '{@link java.util.Calendar <em>Calender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calender</em>'.
	 * @see java.util.Calendar
	 * @model instanceClass="java.util.Calendar"
	 * @generated
	 */
	EDataType getCalender();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebpageFactory getWebpageFactory();

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
		 * The meta object literal for the '{@link de.snehal.emf.webpage.model.webpage.impl.WebImpl <em>Web</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.snehal.emf.webpage.model.webpage.impl.WebImpl
		 * @see de.snehal.emf.webpage.model.webpage.impl.WebpagePackageImpl#getWeb()
		 * @generated
		 */
		EClass WEB = eINSTANCE.getWeb();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB__NAME = eINSTANCE.getWeb_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB__TITLE = eINSTANCE.getWeb_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB__DESCRIPTION = eINSTANCE.getWeb_Description();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB__PAGES = eINSTANCE.getWeb_Pages();

		/**
		 * The meta object literal for the '{@link de.snehal.emf.webpage.model.webpage.impl.WebPageImpl <em>Web Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.snehal.emf.webpage.model.webpage.impl.WebPageImpl
		 * @see de.snehal.emf.webpage.model.webpage.impl.WebpagePackageImpl#getWebPage()
		 * @generated
		 */
		EClass WEB_PAGE = eINSTANCE.getWebPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__NAME = eINSTANCE.getWebPage_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__TITLE = eINSTANCE.getWebPage_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__DESCRIPTION = eINSTANCE.getWebPage_Description();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__KEYWORDS = eINSTANCE.getWebPage_Keywords();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__CATEGORIES = eINSTANCE.getWebPage_Categories();

		/**
		 * The meta object literal for the '{@link de.snehal.emf.webpage.model.webpage.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.snehal.emf.webpage.model.webpage.impl.CategoryImpl
		 * @see de.snehal.emf.webpage.model.webpage.impl.WebpagePackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Articles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__ARTICLES = eINSTANCE.getCategory_Articles();

		/**
		 * The meta object literal for the '{@link de.snehal.emf.webpage.model.webpage.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.snehal.emf.webpage.model.webpage.impl.ArticleImpl
		 * @see de.snehal.emf.webpage.model.webpage.impl.WebpagePackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__NAME = eINSTANCE.getArticle_Name();

		/**
		 * The meta object literal for the '<em>Calender</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Calendar
		 * @see de.snehal.emf.webpage.model.webpage.impl.WebpagePackageImpl#getCalender()
		 * @generated
		 */
		EDataType CALENDER = eINSTANCE.getCalender();

	}

} //WebpagePackage
