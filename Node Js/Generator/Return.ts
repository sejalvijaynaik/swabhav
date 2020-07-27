function* yieldAndReturnGenerator() {
    yield "Y";
    return "R";
    yield "unreachable";
  }
  
  let yieldAndReturn = yieldAndReturnGenerator()
  console.log(yieldAndReturn.next());
  console.log(yieldAndReturn.next());
  console.log(yieldAndReturn.next());