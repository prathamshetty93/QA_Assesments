import Activity from "../PageObjects/DecathlonPlay/ActivityList";
import Login from "../PageObjects/DecathlonPlay/LoginPage"

describe('Test Suit',()=>{


    it('Search And Add to Cart Functionality', ()=>{
        
        const loginPage= new Login();
        const activityPage= new Activity();

        loginPage.launchUrl();
        loginPage.searchForActivity("Cricket");

        activityPage.clickOnCheckBox("Playgrounds");
        activityPage.validateTheFilterText("Playgrounds");
        activityPage.validateRibbonValues("Playground");

    })



})