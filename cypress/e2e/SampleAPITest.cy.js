describe('Test Suit ',()=>{


    it('POST Request',()=>{
        cy.request({
            method:'POST',
            url:"https://dummy.restapiexample.com/api/v1/create",
            headers:{
                'Content-Type':"application/json"
            },
            body:{
                    name:"Chamila",
                    salary: 1000,
                    age: 40
                }
            }).its('status').should('equal',200);
    })

    

    it('POST Request - Extract IDs',()=>{
        cy.request({
            method:'POST',
            url:"https://dummy.restapiexample.com/api/v1/create",
            headers:{
                'Content-Type':"application/json"
            },
            body:{
                    name:"Chamila",
                    salary: 1000,
                    age: 40
                }
            }).then((response) => {
                expect(response.status).to.equal(200);
                const idValue= response.body.data.id;
                console.log(idValue);
            })
    })

    const AUTH_KEY='Bearer f0613e4868211208ec94cf61025fed1aaf8e586689fccb804be7f2d775280d8f';

    it('API Chaining',()=>{
        cy.request({
            method:'GET',
            url:"https://gorest.co.in/public/v2/users",
            headers:{
                Authorization : AUTH_KEY
            }
            }).then((response) => {
                expect(response.status).to.equal(200);
                const idValue= response.body[2].id;
                cy.request({
                    method : 'PUT',
                    url : `https://gorest.co.in/public/v2/users/${idValue}`,
                    headers:{
                        Authorization : AUTH_KEY
                    },
                    body: {
                            "name": "Bodhan Malhotra",
                    }
                }).then((response) => {
                    expect(response.status).to.equal(200);
                    expect(response.body.name).to.equal("Bodhan Malhotra")
                    cy.request({
                        method : 'DELETE',
                        url : `https://gorest.co.in/public/v2/users/${idValue}`,
                        headers:{
                            Authorization : AUTH_KEY
                        }
                    }).then((response) =>{
                        expect(response.status).to.eq(204);
                    })
                })
            })
    })


    it.only('API Chaining - Filtering the values inside the response',()=>{
        cy.request({
            method:'GET',
            url:"https://gorest.co.in/public/v2/users",
            headers:{
                Authorization : AUTH_KEY
            }
            }).then((response) =>{

                expect(response.status).to.eq(200);

                const femaleNames= response.body.filter((user) => user.gender == 'female');

                const names = femaleNames.map((users) => users.name);

                console.log(names);
            })
        
    })

    
    it.only('API Chaining Fetch Paricular Values inside the response',()=>{
        cy.request({
            method:'GET',
            url:"https://gorest.co.in/public/v2/users",
            headers:{
                Authorization : AUTH_KEY
            }
            }).then((response) =>{

                expect(response.status).to.eq(200);

                const ids= response.body.map((user)=>user.id);

                console.log(ids);
            })
        
    })

})

