$(document).ready(function () {

    let Allcustomers = [];
    let AllItems = [];
    let cartDetails = [];

    let selectedItem = null;
    let selectedCustomer = null;

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
                    <option value="${item.code}">${item.name}</option>
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

    $('#CustomerIdSelect').change(function () {
        let customerIdSelect = $('#CustomerIdSelect')
        selectedCustomer = Allcustomers.find((customer) => customer.id === Number(customerIdSelect.val()))
    })

    $('#ItemIdSelected').change(function () {
        let itemIdSelect = $('#ItemIdSelected')
       selectedItem = AllItems.find((item) => item.code === Number(itemIdSelect.val()))

    })

    $('#AddOrder').click(function () {
        let qty = $('#qty').val();

        console.log(selectedCustomer)
        console.log(selectedItem)
        if (selectedItem == null || qty === "") {
            alert("Please select customer and item")
            return;
        }

        let total = selectedItem.price * qty;

        $('#orderTableBody').append(
        /*    <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">CUSTOMER ID</th>
                <th scope="col">ITEM CODE</th>
                <th scope="col">QTY</th>
                <th scope="col">PRICE</th>
                <th scope="col">Actions</th>
            </tr>
            </thead>*/

            `<tr>
                <td>${selectedCustomer.id}</td>
                <td>${selectedItem.code}</td>
                <td>${qty}</td>
                <td>${selectedItem.price}</td>
                <td>${total}</td>
                <td><button class="btn btn-danger">Delete</button></td>
            </tr>`
        )

        selectedItem.qty = qty;
        cartDetails.push(selectedItem)

    });

    $('#placeOder').click(function (){
        $.ajax({
            url :"http://localhost:8080/api/v1/placeOrder/placeOrder",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                "customerDTO": selectedCustomer,
                "itemDTOS": cartDetails
            }),
            success: (res) => {
                alert("Order placed successfully")
            },
            error: (err) => {
                alert("Something went wrong")
                console.log(err)
            }
        })
    })

    getAllCustomers();
    getAllItems();
})