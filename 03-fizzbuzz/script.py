def retorno_fizzbuzz(valor):
    lista = []
    i = 1
    while len(lista) < valor:
        if i % 3 == 0 and i % 5 == 0:
            lista.append("FizzBuzz")
        elif i % 3 == 0:
            lista.append("Fizz")
        elif i % 5 == 0:
            lista.append("Buzz")
        else:
            lista.append(str(i))
        i += 1
    return lista

valor = int(input("Digite o tamanho da lista: "))
print(f"Saída: {retorno_fizzbuzz(valor)}")