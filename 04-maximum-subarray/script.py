def soma_subarray(array: list[int]) -> int:
    lista_soma = []
    for i in range(len(array)):
        for j in range(i, len(array)):
            subarray = array[i:j + 1]
            soma = 0
            for s in subarray:
                soma = soma + s
            lista_soma.append(soma)
    maior_soma = max(lista_soma)

    return maior_soma

nums = []

while(True):
    conteudo_lista = int(input("Digite um número para ser adicionado a lista, caso seja o número 0, o programa entregará o resultado da maior soma em um subarray contíguo:"))
    if conteudo_lista == 0:
        break
    nums.append(conteudo_lista)

print(f"Resultado: {soma_subarray(nums)}")