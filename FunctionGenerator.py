import math;
import random;
def MakeFunction():
  terms = random.randint(1,5)
  powcount = random.randint(1,6)
  ar_op = "+"
  func_str = ""
  for(x in range(terms)):
    if(random.randint(0,1) == 0):
      ar_op = " - "
    else:
      ar_op = " + "
    func_str += (str(random.randint(1,10)) + 'x^' + str(random.randint(1,powcount - x))
  print(func_str)

MakeFunction()
