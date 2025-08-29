import random

def soma_dois_numeros(lista_numeros, target):
    for indice_i, i in enumerate(lista_numeros):
        if len(lista_numeros) < 2 or len(lista_numeros) > 10000:
            return "Quantidade de elementos dentro da lista é insuficiente"
        
        for indice_j, j in enumerate(lista_numeros):
            if indice_i == indice_j:
                continue

            if i + j == target:
                saida = [indice_i, indice_j]
                return saida
    return f"Nenhum valor da lista somado resulta em {target}"

#tamanho_lista = random.randint(2, 10000)
#valores = range(-1_000_000_000, 1_000_000_000)
#nums = random.sample(valores, k=tamanho_lista)

#target = random.randint(-1_000_000_000, 1_000_000_000)


nums = [1, 2, 3, 4, 5, 6, 7, 8, 9]
target = 15

print(nums)
print(target)
print(f"Saída: {soma_dois_numeros(nums, target)}")