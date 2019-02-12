var str = prompt("Enter a string ");
var low;
var up;
low = 0;
up = str.length - 1;

while (low<=up){
    if(str[low] !== str[up]){
        break;
    }
    else{
        low++;
        up--;
    }
}
document.getElementById("string").innerHTML=str;
if (low>up){
    alert("The string is palindrome.");
    document.getElementById("msg").innerHTML= " is a palindrome string";
}
else{
    alert("The string is not a palindrome.");
    document.getElementById("msg").innerHTML= " is not a palindrome string";
}