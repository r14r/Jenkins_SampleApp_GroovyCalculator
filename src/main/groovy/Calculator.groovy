package Calculator.Groovy

class Calculator {
    String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

    def add(x,y)      { x +  y } 
    def subtract(x,y) { x -  y }
    def multiply(x,y) { x *  y }
    def divide(x,y)   { x /  y }
    def power(x,y)    { x ** y }

}

