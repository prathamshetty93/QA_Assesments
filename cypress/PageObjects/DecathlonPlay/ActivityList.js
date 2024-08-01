class Activity {

    offeringCheckboxes="label.ais-RefinementList-label > input.ais-RefinementList-checkbox ~ span"
    filterResult="span.ais-CurrentRefinements-categoryLabel"
    activityRibbon="div.afs-ribbon"

    clickOnCheckBox(offeringValue){
        cy.get(this.offeringCheckboxes).each(($el,index,$list)=>{

            if($el.text() == offeringValue){
                cy.wrap($el).click();
            }
        })
    }

    validateTheFilterText(value){
        cy.wait(3000);
        cy.get(this.filterResult).should('have.text',value);
    }

    validateRibbonValues(ribbonValue){
        cy.get(this.activityRibbon).each((res)=>{
            cy.wrap(res).should('have.text',ribbonValue);
        })
    }



}

export default Activity;