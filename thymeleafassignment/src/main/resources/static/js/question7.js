$(document).on('click', '#button', function () {
    getTime();
});
var getTime = function () {
    var time = $.ajax({
        url: "/gettime",
        method: "GET"
    });
    time.done(function (data) {
        if (data) {
                $('#time').html(data);
        }
    });
    time.fail(function (jqXHR, textStatus) {
        console.log("Error in fetching users");
    })
};

