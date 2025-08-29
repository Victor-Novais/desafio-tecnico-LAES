def verificador_palindromo(frase: str) -> bool:
    frase_final = ""
    frase_formatada = frase.lower()
    for i in frase_formatada:
        if not i.isalnum():
            continue
        else:
            frase_final = frase_final + i
    
    if frase_final == frase_final[::-1]:
        return True
    else:
        return False

frase = str(input("Digite uma frase para a verificação: "))
if len(frase) < 2 or len(frase) > 2*100_000:
    print("Quantidade de letras fora do padrão solicitado.")
elif verificador_palindromo(frase) == True:
    print("Palindromo confirmado!")
else:
    print("Esta frase não é um palindromo!")