# DPH
První projekt na sazby - Engeto

Úkolem zde bylo: 
1. Načíst ze souboru všechna data do vhodné datové struktury (vytvoř třídu pro uložení dat).
2. Vypsat seznam všech států a u každého uveď základní sazbu daně z přidané hodnoty ve formátu podle vzoru: Název země (zkratka): základní sazba %
3. Vypsat ve stejném formátu pouze státy, které mají základní sazbu daně z přidané hodnoty vyšší než 20 % a přitom nepoužívají speciální sazbu daně.
4. Výpis z bodu 3. seřaďit podle výše základní sazby DPH/VAT sestupně (nejprve státy s nejvyšší sazbou).
5. Pod výpis z bodu 3. doplňit řádek s rovnítky pro oddělení a poté seznam zkratek států, které ve výpisu nefigurují.
6. Výsledný výpis zapsat také do souboru s názvem vat-over-20.txt
7. Doplňit možnost, aby uživatel z klávesnice zadal výši sazby DPH/VAT, podle které se má filtrovat. Vypíší se tedy státy se základní sazbou vyšší než ta, kterou uživatel zadal. 
  
    7.1. Pokud uživatel zmáčkne pouze Enter, jako výchozí hodnota se použij jako výchozí sazbu 20 %.
  
    7.2. Upravit název výstupního souboru tak, aby reflektoval zadanou sazbu daně. Například pro zadanou sazbu 17 % se vygeneruje soubor vat-over-17.txt a pro sazbu 25 %          se vygeneruje soubor vat-over-25.txt.
