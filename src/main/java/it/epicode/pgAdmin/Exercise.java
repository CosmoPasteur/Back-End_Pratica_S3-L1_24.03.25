package it.epicode.pgAdmin;

public class Exercise {
    // Esercizio 1 / Estrai tutti i clienti con il nome Mario.
    // select * from clienti where nome = 'Mario';
    // Esercizio 2 / Estrarre nome e cognomedei clienti nati nel 1982.
    // select nome, cognome from clienti where anno_di_nascita = 1982;
    // Esercizio 3 / Estrarre il numero delle fatture con iva al 20%.
    // select count(*) from fatture where iva = 20;
    // Esercizio 4 / Estrarre prod.Attivi nel 2017 e che sono in produzione o commercio.
    // select * from prodotti EXTRACT(year from data_attivazione ) = 2017 and (in_produzione=true or in_commercio=true);
    // Esercizio 5 / Estrarre le fatture con importo inferiore a 1000 e i dati dei clienti ad esse collegate.
    // select numero_fattura, importo, id_cliente from fatture where importo < 1000;
    // Esercizo 6 / Riporta l'elenco delle fatture(numero, importo, iva e data) con il numero del fornitore.
    // select numero_fattura, importo, iva, data_fattura from fatture join fornitori using (numero_fornitore);
    // Esercizio 7 / Solo fatture con iva al 20%, estrarre num.Fatture per ogni anno.
    // select count(*) ,extract(year from data_fattura) as anno_fatturazione from fatture where iva = 20 group by extract(year from data_fattura);
    // Esercizio 8 / Numero di fatture e la somma degli importi divisi per anno di fatturazione
    // select count(*) , sum(importo) ,extract(year from data_fattura) as anno_fatturazione from fatture group by extract(year from data_fattura);
    // [EXTRA]Esercizio 9 / Estrarre gli anni in cui sono state registrate più di 2 fatture con tipologia 'A'.
    // select extract(year from data_fattura) as anno_fatturazione, count(*) as fatture_emesse
    // from fatture
    // where tipologia='A'
    // group by anno_fatturazione
    // having count(*)>2;
    // [EXTRA]Esercizio 10 / Totale degli importi delle fatture divisi per residenza dei clienti.
    // select regione_residenza, sum(importo), '€' as valuta
    // from clienti
    // join fatture on fatture.id_cliente = clienti.numero_cliente
    // group by regione_residenza;
    // [EXTRA]Esercizio 11 / Numero dei clienti nati nel 1980 e che hanno almeno una fattura superiore a 50 euro.
    // select count(*) from clienti
    // join fatture on fatture.id_cliente = clienti.numero_cliente
    // where clienti.anno_di_nascita = 1980 and importo>50;}
