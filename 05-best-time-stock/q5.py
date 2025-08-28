


def maxLucro(prices: list[int]) -> int:
    min_price = prices[0] #menor preço, começa com o primeiro valor
    max_profit = 0 #maior lucro começa com 0

    for i, price in enumerate(prices):
        #Pega sempre o menor preço
        if price < min_price:
            min_price = price

        # Calcula o lucro se tivéssemos comprado a ação no menor preço encontrado
        # até agora e vendido no preço atual (preço - min_price).

        #o lucro no menor preço encontrado
        profit = price - min_price

        # Atualiza o lucro máximo encontrado até agora. Se o lucro atual for maior sempre pegando com max
        #o maior comparando o lucro calculado, com o maior lucro acumulado

        max_profit = max(max_profit, profit)

    return max_profit

if __name__ == '__main__':

    #Exemplo1
    print(maxLucro([7,1,5,3,6,4]))
    #Exemplo2
    print(maxLucro([7,6,4,3,1]))