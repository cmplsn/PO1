# PO1

- **Campi**: stato di un oggetto
- **Metodi**: funzionalità dell'oggetto

## Incapsulamento
Nella programmazione ad oggetti vogliamo che i dati siano strettamente accoppiato con le funzionalità che
necessitano di accedere e/o modificare i dati.
I dati sono rappresentati attraverso i **CAMPI**.

Ogni campo è la definizione di:
- un nome
- un tipo statico

Un metodo è l'implementazione di una funzione che accede o modifica i campi di un oggetto.

### Classi
**Template dal quale possono essere istanziati oggetti**

Definiscono la struttura dei dati salvati negli oggetti attraverso un insieme di *campi* e le loro funzioni attraverso
un insieme di *metodi*.

Ogni campo ed ogni metodo devono avere firma singolare e diversa l'uno dall'altro: campi con nomi diversi e fime con 
nome e/o numero di parametri diverso. (!!Campi con tipo diverso ma stesso nome NON sono ammessi)

Creiamo un nuovo oggetto di una classe con la keyword ***new*** e il nome della classe di cui vogliamo istanziare il nuovo
oggetto. Possiamo "mettere" il nuovo oggetto all'interno di una variabile locale ed accedere a metodi/campi dell'oggetto
attraverso il nome della variabile.

### Eseguire il programa
In Java non esiste un singolo ed unico entry-point per l'inizio dell'esecuzione. Ogni classe può definire un proprio 
metodo main che è un possibile entry-point quindi al momento dell'esecuzione del programma dovremo istruire la vm su dove
vogliamo che inizi l'esecuzione (specificando "javac <Nome_File.java>" e poi "java <nome_classe_entrypoint>")

### Interazione tra Oggetti
Una classe da noi definita può anche essere un campo di un'altra classe -> **Ogni classe definisce un tipo a sé stante**.
In questa maniera un oggetto può contenere (un pointer ad) un altro oggetto dentro i suoi campi, o può ricevere un altro
oggetto come parametro di un suo metodo.

!!! QUANDO NON ASSEGNAMO UN VALORE INIZIALE ESPLICITO AD UN CAMPO, ESSO É AUTOMATICAMENTE INIZIALIZZATO A 0 (o Null)!!!

