let display = document.getElementById("screen");
let ans;

function btn7() {
  display.value += "7";
  // console.log(display.value);
}

function btn8() {
  display.value += "8";
  // console.log(display.value);
}

function btn9() {
  display.value += "9";
  // console.log(display.value);
}

function btn4() {
  display.value += "4";
  // console.log(display.value);
}

function btn5() {
  display.value += "5";
  // console.log(display.value);
}

function btn6() {
  display.value += "6";
  // console.log(display.value);
}

function btn1() {
  display.value += "1";
  // console.log(display.value);
}

function btn2() {
  display.value += "2";
  // console.log(display.value);
}

function btn3() {
  display.value += "3";
  // console.log(display.value);
}

function btn0() {
  display.value += "0";
  // console.log(display.value);
}

function btnAdd() {
  // console.log(display.value);
  // let temp = display.value.split(' ');
  display.value += " + ";
}

function btnSub() {
  display.value += " - ";
}

function btnMulti() {
  display.value += " * ";
}

function btnDiv() {
  display.value += " / ";
}

function btnClear() {
  display.value = "";
  // console.log(display.value);
}

function btnResult() {
  let temp = display.value.split(" ");

  // if(temp[1] == '+') {
  //     ans = parseInt(temp[0]) + parseInt(temp[2]);
  //     display.value = null;
  //     display.value += ans;
  // }
  // else if(temp[1] == '-') {
  //     ans = parseInt(temp[0]) - parseInt(temp[2]);
  //     display.value = null;
  //     display.value += ans;
  // }
  // else if(temp[1] == '*') {
  //     ans = parseInt(temp[0]) * parseInt(temp[2]);
  //     display.value = null;
  //     display.value += ans;
  // }
  // else if(temp[1] == '/') {
  //     ans = parseInt(temp[0]) / parseInt(temp[2]);

  //     display.value = null;
  //     display.value += ans;
  // }
  // else {
  //     display.value = null;
  //     display.value += 'Invalid Input';
  // }

  // 0 1 2 3 4
  // 8 + 8 + 8
  for (let index = 0; index < temp.length; index++) {
    if(index % 2 != 0) {
        if(temp[index] == '+') {
            ans = parseInt(temp[index - 1]) + parseInt(temp[index + 1]);
        }
        else if(temp[index] == '-') {
            ans = parseInt(temp[index - 1]) - parseInt(temp[index + 1]);
        }
        else if(temp[index] == '*') {
            ans = parseInt(temp[index - 1]) * parseInt(temp[index + 1]);
        }
        else if(temp[index] == '/') {
            ans = parseInt(temp[index - 1]) / parseInt(temp[index + 1]);
        }
        else {
            display.value = null;
            display.value += 'Invalid Input';
        }
        display.value = null;
        display.value += ans;
    }
  }

  console.log(temp);
}
