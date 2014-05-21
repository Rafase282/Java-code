'''
Created on Nov 29, 2013

@author: rafase282
'''
def fibonacci(number):
    if number <=1:
        return number
    else:
        return fibonacci(number-2)+fibonacci(number-1)
if __name__ == '__main__':
    number = int(input("Enter the number from zero and up: "))
    print(fibonacci(number))
    
