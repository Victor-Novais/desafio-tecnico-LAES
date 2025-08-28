

def maiorSeqArray(nums: list[int]) -> int:
    # inicializa as variáveis com o primeiro elemento
    melhor_soma_atual = nums[0]
    melhor_soma_total = nums[0]

    # Percorre os elementos a partir do segundo
    for num in nums[1:]:
        #a melhor soma no momento vai ser o maior valor entre o numero atual a melhor soma até o momento + o numero
        melhor_soma_atual = max(num, melhor_soma_atual + num)

        # a melhor soma total vai ser o maior valor comparando o valor da soma total com o valor da soma atual
        melhor_soma_total = max(melhor_soma_total, melhor_soma_atual)

    return melhor_soma_total

if __name__ == '__main__':
    #Exemplo1
    print(maiorSeqArray([-2, 1, -3, 4, -1, 2, 1, -5, 4]))

    # Exemplo 2
    print(maiorSeqArray([1]))

    # Exemplo 3
    print(maiorSeqArray([5, 4, -1, 7, 8]))
