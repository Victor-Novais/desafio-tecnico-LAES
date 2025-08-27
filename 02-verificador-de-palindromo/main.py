def verificaPalindromo(s):
    texto_limpo = ""

    for caractere in s:
        if caractere.isalnum():
            texto_limpo += caractere.lower()
    return texto_limpo == texto_limpo[::-1]

print(verificaPalindromo("A man, a plan, a canal: Panama"))
print(verificaPalindromo("play a game"))
