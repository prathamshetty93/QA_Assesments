import Login from "../PageObjects/LoginPage"
import Item from "../PageObjects/ItemPage"
import Cart from "../PageObjects/Cart"



describe("Decathelon Test ", ()=>{

    it("Search Functionality",()=>{

        const loginPage=new Login();

        loginPage.launchUrl();

        loginPage.performSearch("Shoes");

        loginPage.validateSerachedItem("Shoes");

    })

    it.only("Add To Cart Functionality",()=>{

        const loginPage = new Login();
        const itemPage = new Item();
        const cartPage = new Cart();

        loginPage.launchUrl();

        loginPage.performSearch("Shoes");

        loginPage.validateSerachedItem("Shoes");

        loginPage.clickOnFirstItem();

        itemPage.validateItemInItemList("Shoes").then(itemName => {
            
            itemPage.addToCartOption();
            itemPage.clickOnCartIcon();
            cartPage.validateCartItemName(itemName);
        });

    })

})