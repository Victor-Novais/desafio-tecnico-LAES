def quem_ta_faltando(array: list[int]) -> int:
    lista_ordenada = sorted(array)

    for i in range(len(lista_ordenada)-1):
        numero_atual = lista_ordenada[i]
        proximo = lista_ordenada[i+1]
        if proximo - numero_atual > 1:
            return numero_atual + 1
    return lista_ordenada[-1] + 1

nums = [1,2,4]

print(f"Saída: {quem_ta_faltando(nums)}")