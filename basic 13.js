// Basic 13

// 1) Print 1 - 255
function oneto255() {
    for (var i = 0; i <= 255; i++) {
        console.log(i)
    }
}
console.log("Print 1 - 255")
oneto255()


// 2) Print Odds 1 - 255
function oddsOneto255() {
    for (var i = 0; i <= 255; i++) {
        if (i % 2 == 1) {
            console.log(i)
        }
    }
}
console.log("\n\nPrint Odds 1 - 255")
oddsOneto255()


// 3) Print Ints and Sum 0 - 255
// Print integers from 0 to 255 and with each integer print the sum so far.Example: 0, sum: 0 1, sum: 1, 2, sum: 3, etc.

function printIntsSum() {
    var sum = 0;
    for (var i = 0; i <= 255; i++) {
        sum += i;
        console.log('Number: ' + i + ', Sum:' + sum);
    }
}
console.log("\n\nPrint Ints and Sum 0 - 255")
printIntsSum()


// 4) Iterate and Print Array
// Iterate through a given array and print each value

function iterateArray(iterateArr) {
    var length = iterateArr.length
    for (var i = 0; i < length; i++) {
        console.log(iterateArr[i]);
    }
}
console.log("\n\nIterate and Print Array [1, 3, 5, 7, 9, 13]");
iterateArray([1, 3, 5, 7, 9, 13]);


// 5) Find and Print Max
// Given an array, find and print the largest element

function printMaxArray(arr) {
    // arr = [20, 30, 5, 40, -122, 1];
    var length = arr.length;
    var max = arr[0];
    for (var i = 1; i < length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    console.log('\n\nMax value of [-3, -5, -7] is: ' + max);
}
printMaxArray([-3, -5, -7]);


// 6) Get and Print Average
// Given an array, determine the average of the values and print it.
function printAverage(aveArray) {
    var average = 0;
    var length = aveArray.length;
    for (var i = 0; i < length; i++) {
        average += aveArray[i];
    }
    average /= length;
    console.log("\n\nThe Average Number between [2, 10, 3] is: " + average)
}
printAverage([2, 10, 3]);


// 7) Array with Odds
// Build an array with all odds between 1 and 255(inclusive)
function arrayOddNumbers(oddArray) {
    for (var i = 0; i <= 256; i++) {
        if (i % 2 == 1) {
            oddArray.push(i);
        }
    }
    console.log("\n\nBuild Array with Odds between 1 and 255")
    console.log(oddArray)
}
arrayOddNumbers([]);


// 8) Square the Values
// Square each value in a given array, return the same array with changed values.
function squareValues(squareArray) {
    var length = squareArray.length;
    for (var i = 0; i < length; i++) {
        squareArray[i] *= squareArray[i];
    }
    console.log("\n\nSquare the Values: [1, 5, 10, -2]")
    console.log((squareArray))
}
squareValues([1, 5, 10, -2]);


// 9) Greater than Y
// Given an array and value Y, count and print the number of array values greater than Y
function greaterThanY(arrayGTY, y) {
    var temp = 0;
    var length = arrayGTY.length;
    for (var i = 0; i < length; i++) {
        if (arrayGTY[i] > y) {
            temp++;
        }
    }
    console.log("\n\nGreater than Y: [1, 3, 5, 7], 3");
    console.log(temp);
}
greaterThanY([1, 3, 5, 7], 3);


// 10) Zero Out Negatives
// Given an array with values, set any negative values to zero
function delNegativeNumbers(zeroArr) {
    var length = zeroArr.length;
    for (var i = 0; i < length; i++) {
        if (zeroArr[i] < 0) {
            zeroArr[i] = 0
        }
    }
    console.log("\n\nZero Out Negatives: [1, 5, 10, -2]")
    console.log((zeroArr))
}
delNegativeNumbers([1, 5, 10, -2]);


// 11) Max, Min, Average
// Given an array, print the max, min and average values for the array
function maxMinAve(arrX) {
    var length = arrX.length
    var avg = 0
    var min = arrX[0]
    var max = arrX[0]
    for (var i = 0; i < length; i++) {
        if (arrX[i] < min) {
            min = arrX[i];
        }
        else if (arrX[i] > max) {
            max = arrX[i];
        }
        avg += arrX[i]
    }
    console.log("\n\nMin: " + min, "/ Max: " + max, "/ Average: " + avg / arrX.length)
}
maxMinAve([1, 5, 10, -2]);


// 12) Shift Array Values
// Given an array, move all values forward by one index, dropping the first and leaving a zero value at the end. 
// [1, 2, 3] becomes[2, 3, 0] for example
function shiftValues(arrX) {
    var length = arrX.length
    for (var i = 0; i < length - 1; i++) {
        arrX[i] = arrX[i + 1];
    }
    arrX[arrX.length - 1] = 0
    console.log("\n\nShift Array Values: [1, 2, 3]")
    console.log(arrX)
}
shiftValues([1, 2, 3]);


// 13) Swap String for Negatives
// Given an array, replace any negative values with the string "Dojo"
function swapStrNegatives(strArr) {
    var length = strArr.length;
    for (var i = 0; i < length; i++) {
        if (strArr[i] < 0) {
            strArr[i] = "Dojo"
        }
    }
    console.log("\n\nSwap String for Negatives: [1, -5, 10, -2]")
    console.log((strArr))
}
swapStrNegatives([1, -5, 10, -2]);