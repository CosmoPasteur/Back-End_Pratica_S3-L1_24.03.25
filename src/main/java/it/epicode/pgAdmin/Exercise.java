package it.epicode.pgAdmin;

public class Exercise {
    // Esercizio 1 / Estrai tutti i clienti con il nome Mario.
    // select * from clienti where nome = 'Mario';
    // Esercizio 2 / Estrarre nome e cognomedei clienti nati nel 1982.
    // select nome, cognome from clienti where anno_di_nascita = 1982;
    // Esercizio 3 / Estrarre il numero delle fatture con iva al 20%.
    // select * from fatture where iva = 20;
    // Esercizio 4 / Estrarre prod.Attivi nel 2017 e che sono in produzione o commercio.
    // select * from prodotti where EXTRACT(year from data_attivazione ) = 2017 and (in_produzione or in_commercio);
    // Esercizio 5 / Estrarre le fatture con importo inferiore a 1000 e i dati dei clienti ad esse collegate.
    // select numero_fattura, importo, id_cliente from fatture where importo < 1000;
    // Esercizo 6 / Rporta l'elenco delle fatture(numero, importo, iva e data) con il numero del fornitore.
    // select numero_fattura, importo, iva, data_fattura from fatture join fornitori using (numero_fornitore);
    //

}
