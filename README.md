# Tests

## Addition
##### Regular addition
- firstOperand = 7
- secondOperand = 3
- expected result = 10

##### Negative second operand
- firstOperand = 3
- secondOperand = -6
- expected result = -3

##### 0 as first operand
- firstOperand = 0
- secondOperand = 3
- expected result = 3

## Subtraction
##### Regular subtraction
- firstOperand = 13
- secondOperand = 3
- expected result = 10

##### Negative result
- firstOperand = 3
- secondOperand = 6
- expected result = -3

##### Subtracting zero
- firstOperand = 5
- secondOperand = 0
- expected result = 5


## Division
##### Even division
- firstOperand = 10
- secondOperand = 5
- expected result = 2

##### Integer truncation
- firstOperand = 3
- secondOperand = 4
- expected result = 0

##### Dividing by zero
- firstOperand = 8
- secondOperand = 0
- expected result = UnsupportedOperationException

##### Divisor negative
- firstOperand = 5
- secondOperand = -1
- expected result = -5


## Multiplication
##### Positive Multiplication
- firstOperand = 3
- second Operand = 3
- expected result = 9


##### Negative Multiplication
- firstOperand = 3
- second Operand = -3
- expected result = -9


##### Double Negative Multiplication
- firstOperand = -3
- second Operand = -3
- expected result = 9


#####  Multiplication by Zero
- firstOperand = 3
- second Operand = 0
- expected result = 0


## Factorial
##### Positive Factorial
- firstOperand = 5
- expected result = 120


##### Negative Factorial
- firstOperand = -2
- expected result = UnsupportedOperationException


#####  Zero Factorial
- firstOperand = 0
- expected result = 1