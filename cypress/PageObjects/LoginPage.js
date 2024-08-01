class Login{


    searchBox="body > div:nth-child(1) > div:nth-child(1) > main:nth-child(1) > header:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"
    searchInput="input#search"
    searchResult="div.right-panel > div.text-center"
    itemList="p.capitalize"

    launchUrl(){
        cy.visit("https://www.decathlon.in/");
    }

    performSearch(itemToBeSearched){
        cy.get(this.searchBox).click();
        cy.get(this.searchInput).type(itemToBeSearched+'{enter}')
    }


    validateSerachedItem(itemSearched){
        cy.get(this.searchResult).should('contain',itemSearched);
    }

    clickOnFirstItem(){
        cy.get(this.itemList).first().click();
    }
}


export default Login;



// Higher Order Functions 


// Avoid writing repeatative code - Instead of having 3 different functions for find the area, circumference and diameter 

const radius = [2,5,6,8];

const area = function (radius){
    return Math.PI * radius * radius;
}

const circumference = function (radius){
    return 2 * Math.PI * radius;
}

const calculate = function (radius,logic){
    const output =[]
    for(let i =0; i< radius.length; i++){
        output.push(logic);
    }
    return output;
}

calculate(radius,area);

//this keyword behaviour in global space 