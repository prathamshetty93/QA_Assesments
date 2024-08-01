class Cart{

    cartItemName="div.flex > div.w-full > p.whitespace-nowrap"


    validateCartItemName(itemName){
        cy.get(this.cartItemName).should('have.text',itemName);
    }

}

export default Cart;