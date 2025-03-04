$(document).ready(function () {

    let Allcustomers = [];
    let AllItems = [];

    function getAllCustomers() {
        $.ajax({
            url: "http://localhost:8080/api/v1/customer/get",
            type: "GET",
            success: (res) => {
                $('#CustomerIdSelect').empty();
                $('#CustomerIdSelect').append(`

                <option selected disabled>select customer</option>
                
                `)
                res.data.forEach((customer) => {
                    $('#CustomerIdSelect').append(`
                    <option value="${customer.id}">${customer.name}</option>
                    `)
                });
                Allcustomers = res.data
            },
            error: (err) => {
                alert("Something went wrong!")
                console.log(err)
            }
        })
    }

    function getAllItems() {
        $.ajax({
            url: "http://localhost:8080/api/v1/item/get",
            type: "GET",
            success: (res) => {
                $('#ItemIdSelected').empty();
                $('#ItemIdSelected').append(`
                <option selected disabled>select item</option>
                `)

                res.data.forEach((item) => {
                    $('#ItemIdSelected').append(`
                    <option value="${item.id}">${item.name}</option>
                    `)
                });
                AllItems = res.data
            },
            error: (err) => {
                alert("Something went wrong!")
                console.log(err)
            }
        })
    }

    getAllCustomers();
    getAllItems();
})