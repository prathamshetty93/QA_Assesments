

class Item{

    itemHeading="button#share-product ~ h1"
    sizeSelect="div#size-select-container > div"
    addToCartBtn="div > span.text-white"
    cartIcon="a.mx-5[href='/cart']"


    validateItemInItemList(itemSearched) {
        return cy.get(this.itemHeading)
            .invoke('text')
            .then(name => {
                return name.trim();
            })
    }
    


    addToCartOption(){
        cy.wait(3000);
        cy.get(this.sizeSelect).first().click();
        cy.get(this.addToCartBtn).click();
    }

    clickOnCartIcon(){
        cy.scrollTo('top');
        cy.get(this.cartIcon).click();
    }


}

export default Item;



