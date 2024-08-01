class Login{


    searchBox="form.form-inline > input#main-header-search"
    searchInput="form.form-inline > input#main-header-searchbody"
    

    launchUrl(){
        cy.visit("https://play.decathlon.in/");
    }

    searchForActivity(itemToBeSearched){
        cy.wait(3600);
        cy.get(this.searchBox).type(itemToBeSearched+'{enter}');
    }
}

export default Login;