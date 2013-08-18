package com.sayem.util;


public class Constants {

    // PATHS
    public static String CONFIG_FILE_PATH ="src/main/java/com/sayem/config/config.properties";
    public static String OR_FILE_PATH ="src/main/java/com/sayem/config/OR.properties";


    /***************************************** LOGIN PAGE ***************************************************************************/
    // LoginPage - Sign In Page
    public static final String loginPage_EmailAddress ="#email";
    public static final String loginPage_Password ="#pass";
    public static final String loginpage_SignInButton ="#submit-button";

    // Forgot your password link
    public static final String LoginPage_ForgotYourPassword =".pull-right";

    // Sign up link
    public static final String loginPage_SignUpLink =".page-header>h2>small>a";

    /***************************************** SIGN UP PAGE *************************************************************************/
    public static final String signupPage_EmailAddress ="#email_address";
    public static final String signupPage_Password ="#password";
    public static final String signupPage_CofirmPassword ="#confirmation";
    public static final String signupPage_Button ="#submit-button";


    /***************************************** RESET PASSWORD************************************************************************/

    public static final String resetPasswordPage_Email ="#email_address";
    public static final String resetPasswordPage_Button =".button.btn.btn-primary.btn-large";

    /***************************************** LandingPage ***************************************************************************/
    public static final String SendInvitationFriendPopUp ="#contact_list";
    public static final String sendInvitationPopUpButton =".button.btn.btn-primary.pull-right";

    /***************************************** TOP MENU *****************************************************************************/

    public static final String topMenuTotsyLogo ="#logo>a>img";


    public static final String topMenuAllSales ="";
    public static final String topMenuNewSales ="";
    public static final String topMenuUpcomingSales ="";

    // SHOP BY CATEGORY
    public static final String shopByCat_boysApparel ="#navByCat>ul>li:nth-of-type(2)>a";
    public static final String shopByCat_girlsApparel ="#navByCat>ul>li:nth-of-type(3)>a";
    public static final String shopByCat_shoes ="#navByCat>ul>li:nth-of-type(4)>a";
    public static final String shopByCat_accessories ="#navByCat>ul>li:nth-of-type(5)>a";
    public static final String shopByCat_toysAndBooks ="#navByCat>ul>li:nth-of-type(6)>a";
    public static final String shopByCat_home ="#navByCat>ul>li:nth-of-type(7)>a";
    public static final String shopByCat_gear ="#navByCat>ul>li:nth-of-type(8)>a";
    public static final String shopByCat_momAndDad ="#navByCat>ul>li:nth-of-type(9)>a";


    // SHOP BY AGE
    public static final String shopByAge_newborn ="#navByAge>ul>li:nth-of-type(2)>a";
    public static final String shopByAge_infant ="#navByAge>ul>li:nth-of-type(3)>a";
    public static final String shopByAge_toddler ="#navByAge>ul>li:nth-of-type(4)>a";
    public static final String shopByAge_preschool ="#navByAge>ul>li:nth-of-type(5)>a";
    public static final String shopByAge_tschoolAge ="#navByAge>ul>li:nth-of-type(6)>a";
    public static final String shopByAge_adult ="#navByAge>ul>li:nth-of-type(7)>a";




    // MY ACCOUNT : TOP MENU-DROP DOWN LIST
    public static final String topMenuMyAccountLink ="#userAccount";
    public static final String topMenuAccountDashboardLink ="ul.dropdown-menu>li:nth-of-type(1)";
    public static final String topMenuAccountInformationLink ="ul.dropdown-menu>li:nth-of-type(2)";
    public static final String topMenuManageCreditCardLink ="ul.dropdown-menu>li:nth-of-type(3)";
    public static final String topMenuChangePasswordLink ="ul.dropdown-menu>li:nth-of-type(4)";
    public static final String topMenuAddressBookLink ="ul.dropdown-menu>li:nth-of-type(5)";
    public static final String topMenuMyOrderLink ="ul.dropdown-menu>li:nth-of-type(6)";
    public static final String topMenuMyCreditLink ="ul.dropdown-menu>li:nth-of-type(7)";
    public static final String topMenuMyInvitationsLink ="ul.dropdown-menu>li:nth-of-type(8)";
    public static final String topMenuLogOutLink ="ul.dropdown-menu>li:nth-of-type(10)";


    /***************************************** MY ACCOUNT ***************************************************************************/
    // My Account page - Drop down list - https://www.totsy.com/customer/account/
    public static final String accountDashboardDropListLink ="div:nth-of-type(2) > div:nth-of-type(1) > ul > li:nth-of-type(2) > a";
    public static final String accountInformationDropListLink ="div:nth-of-type(2) > div:nth-of-type(1) > ul > li:nth-of-type(3) > a";
    public static final String ManageCreditCardDropListLink ="div:nth-of-type(2) > div:nth-of-type(1) > ul > li:nth-of-type(4) > a";
    public static final String changePasswordDropListLink ="div:nth-of-type(2) > div:nth-of-type(1) > ul > li:nth-of-type(5) > a";
    public static final String AddressBookDropListLink ="div:nth-of-type(2) > div:nth-of-type(1) > ul > li:nth-of-type(6) > a";
    public static final String myOrderDropListLink ="div:nth-of-type(2) > div:nth-of-type(1) > ul > li:nth-of-type(7) > a";
    public static final String myCreditDropListLink ="div:nth-of-type(2) > div:nth-of-type(1) > ul > li:nth-of-type(8) > a";
    public static final String myInvitationsDropListLink ="div:nth-of-type(2) > div:nth-of-type(1) > ul > li:nth-of-type(9) > a";


    // NEED HELP
    public static final String helpDeskDropListLink ="div:nth-of-type(2) > div:nth-of-type(2) > ul > li:nth-of-type(2) > a";
    public static final String faqsDropListLink ="div:nth-of-type(2) > div:nth-of-type(2) > ul > li:nth-of-type(3) > a";
    public static final String privacyPolicyDropListLink ="div:nth-of-type(2) > div:nth-of-type(2) > ul > li:nth-of-type(4) > a";
    public static final String termOfUseDropListLink ="div:nth-of-type(2) > div:nth-of-type(2) > ul > li:nth-of-type(5) > a";

    /***************************************** Add New Address**********************************************************************/

   // Add New Address
    public static final String addressBook_firstName ="#firstname";
    public static final String addressBook_lastName ="#lastname";
    public static final String addressBook_telephone ="#telephone";
    public static final String addressBook_streetAddress ="#street_1";
    public static final String addressBook_city ="#city";
    public static final String addressBook_state ="#region_id";
    public static final String addressBook_zipCode ="#zip";
    public static final String addressBook_saveAddressButton =".button.btn.btn-primary";

    // Radio Button
    public static final String addressBook_defaultBilling ="#primary_billing";
    public static final String addressBook_defaultShipping ="#primary_shipping";


    /***************************************** BOTTOM MENU ***************************************************************************/
    public static final String bottomMenu_aboutUs ="";
    public static final String bottomMenu_careers ="";
    public static final String bottomMenu_blog ="";
    public static final String bottomMenu_affiliates ="";
    public static final String bottomMenu_madeInNYC ="";
    public static final String bottomMenu_faq ="";
    public static final String bottomMenu_contactUs ="";
    public static final String bottomMenu_termsOfUse ="";
    public static final String bottomMenu_privacyPolicy ="";


    /***************************************** Add To Cart Page************************************************************************/
    public static final String addToCartPage_size ="#attribute85";
    public static final String addToCartPage_color ="#attribute169";
    public static final String addToCartPage_qty ="#qty";
    public static final String addToCartPage_button =".button.btn-cart.btn.btn-primary";
    public static final String addToCartPage_checkoutButton =".btn.checkout.btn-primary";


    /***************************************** Shopping Cart Page**********************************************************************/
    public static final String shoppingCartPage_removeItem ="";
    public static final String shoppingCartPage_updateCart ="";
    public static final String shoppingCartPage_qty ="";
    public static final String shoppingCartPage_proceedToCheckoutButton ="";
    public static final String shoppingCartPage_applyCoupon ="";
    public static final String shoppingCartPage_enterCoupon ="";
    public static final String shoppingCartPage_enterGiftCard ="";
    public static final String shoppingCartPage_addGiftCard ="";
    public static final String shoppingCartPage_checkGiftCard ="";

    /***************************************** Checkout Cart Page**********************************************************************/

    // Billing Address
    public static final String checkoutPage_billing_firstName ="//*[@id='billing:firstname']";
    public static final String checkoutPage_billing_lastName ="//*[@id='billing:lastname']";
    public static final String checkoutPage_billing_address1 ="//*[@id='billing:street1']";
    public static final String checkoutPage_billing_address2 ="//*[@id='billing:street2']";
    public static final String checkoutPage_billing_state ="//*[@id='billing:region_id']";
    public static final String checkoutPage_billing_city ="//*[@id='billing:city']";
    public static final String checkoutPage_billing_zipCode ="//*[@id='billing:postcode']";
    public static final String checkoutPage_billing_phone="//*[@id='billing:telephone']";
    public static final String checkoutPage_billing_shipThisToAddress ="//*[@id='button_ship_to']";

    // Shipping Address
    public static final String checkoutPage_shipping_firstName ="//*[@id='shipping:firstname']";
    public static final String checkoutPage_shipping_lastName ="//*[@id='shipping:lastname']";
    public static final String checkoutPage_shipping_address1 ="//*[@id='shipping:street1']";
    public static final String checkoutPage_shipping_address2 ="//*[@id='shipping:street2']";
    public static final String checkoutPage_shipping_state ="//*[@id='shipping:region_id']";
    public static final String checkoutPage_shipping_city ="//*[@id='shipping:city']";
    public static final String checkoutPage_shipping_zipCode ="//*[@id='shipping:postcode']";
    public static final String checkoutPage_shipping_phone="//*[@id='shipping:telephone']";

    // Payment information
    public static final String checkoutPage_amex ="//*[@id='paymentfactory_tokenize_cc_type']/input[1]";
    public static final String checkoutPage_visa ="//*[@id='paymentfactory_tokenize_cc_type']/input[2]";
    public static final String checkoutPage_masterCard ="//*[@id='paymentfactory_tokenize_cc_type']/input[3]";
    public static final String checkoutPage_discover="//*[@id='paymentfactory_tokenize_cc_type']/input[4]";
    public static final String checkoutPage_creditCardNumber ="//*[@id='paymentfactory_tokenize_cc_number']";
    public static final String checkoutPage_CVN ="//*[@id='paymentfactory_tokenize_cc_cid']";
    public static final String checkoutPage_expMonth ="//*[@id='paymentfactory_tokenize_expiration']";
    public static final String checkoutPage_expYear="//*[@id='paymentfactory_tokenize_expiration_yr']";
    public static final String checkoutPage_saveThisCC ="//*[@id='paymentfactory_tokenize_saved']";
    public static final String checkoutPage_placeOrder ="//*[@id='placeOrderBtn']";
    public static final String checkoutPage_editYourCart="//*[@id='review-buttons-container']/p/a";

}
