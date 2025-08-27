def lucroMaximo(prices):
    if len(prices) < 2:
        return 0
    
    menor_preco = prices[0]
    maior_lucro = 0

    for preco in prices[1:]:
        lucro = preco - menor_preco
        if lucro > maior_lucro:
            maior_lucro = lucro

        if preco < menor_preco:
            menor_preco = preco

    return maior_lucro

print(lucroMaximo([7,1,5,3,6,4]))
print(lucroMaximo([7,6,4,3,1])) 