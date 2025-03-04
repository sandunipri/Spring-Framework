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

    $('#CustomerIdSelect').change(function () {
        selectedCustomer = Allcustomers.find((customer) => {
            return customer.id === $('#CustomerIdSelect').val()
        })
    })

    $('#ItemIdSelected').change(function () {
       selectedItem = AllItems.find((item) => {
            return item.id === $('#ItemIdSelected').val()
        })

    })

    $('#AddOrder').click(function () {
        let qty = $('#qty').val();

        if (selectedItem ==null || selectedCustomer == null) {
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
        let customerId  = $('#CustomerIdSelect').val();
        let customer = Allcustomers.find((customer) => customer.id === Number(customerId))

        $.ajax({
            url :"",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                "customerDTO": customer,
                "orderDetailsDTO": cartDetails
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