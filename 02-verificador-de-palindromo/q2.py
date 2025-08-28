

def verify_palindromo(s: str) -> bool:

    # dois ponteiros, left sendo o primeiro char da str e right sendo o ultimo
    left, right = 0, len(s) - 1

    while left < right:
        # verificacao dos caracteres, pula o que nao for alfanumerico
        while left < right and not s[left].isalnum():
            left += 1
        while left < right and not s[right].isalnum():
            right -= 1

        # compara a esquerda com a direita e vai percorrendo -><- verificando se cada char é igual, se todos forem, é palindromo.
        if s[left].lower() != s[right].lower():
            return False

        left += 1
        right -= 1

    return True

if __name__ == '__main__':
    # Exemplo 1
    print(verify_palindromo("A man, a plan, a canal: Panama"))  # True

    # Exemplo 2
    print(verify_palindromo("race a car"))  # False

    # Exemplo 3
    print(verify_palindromo(" "))  # True



