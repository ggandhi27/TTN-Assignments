var r = prompt("Enter a radius");
console.log(typeof  r);
r = parseInt(r);
var area;
if (typeof  r != "number"){
    alert("Please enter a valid radius. Refresh the page.")
}
else{
    area=(22/7)*r*r;
    alert("Area of the circle is "+(area));
    document.getElementById("area").innerHTML = area;
}