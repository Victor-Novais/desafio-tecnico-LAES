def validParentheses(s):
    abertos = []
    pares = {')' : '(', ']' : '[', '}' : '{'}

    for caractere in s:
        if caractere in "([{":
            abertos.append(caractere)
        else:
            if not abertos or abertos[-1] != pares[caractere]:
                return False
            abertos.pop()

    return len(abertos) == 0
    
print(validParentheses("()"))      
print(validParentheses("()[]{}")) 
print(validParentheses("(]"))       
print(validParentheses("([])"))     
print(validParentheses("([)]")) 