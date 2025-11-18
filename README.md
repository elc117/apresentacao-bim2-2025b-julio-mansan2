# Outras classes relacionadas à programação concorrente em Java

## 1. Semaphore:

Um semáforo em programação concorrente é uma classe que mantém permissões, estas sendo concedidas às Threads que buscam acessar o recurso. Ou seja, se uma thread solicita uma permissão e o semáforo a possui, ela é concedida à thread. Do contrário, a thread fica bloqueada até que alguma permissão fique disponível.

<video controls src="static/Semaphore.mp4" title="Semaphore"></video>

* No código-exemplo, são criadas 5 threads e um semáforo com 2 permissões. 2 threads "entram" no semáforo e o restante permanece bloqueado. Quando as permissões são liberadas novamente, a thread que estava bloqueada, entra no semáforo. Isso persiste até a finalização do programa.

<br>

## 2. Exchanger

Exchanger é uma classe que permite que duas threads troquem objetos de maneira síncrona. Funciona como um ponto de encontro, onde uma thread espera a chegada de outro e ambos "trocam" objetos entre si.

<video controls src="static/Exchanger.mp4" title="Exchanger"></video>

* No código-exemplo, são criadas 2 threads e um exchanger. A primeira thread envia sua mensagem e fica esperando a próxima thread. Quando a segunda thread envia a sua mensagem para o exchanger, ambas "trocam" e o programa finaliza.

<br>

## 3. CyclicBarrier

CyclicBarrier é uma classe de sincronização que permite que múltiplas threads esperem umas as outras para continuar a execução do programa.

<video controls src="static/CyclicBarrier.mp4" title="CyclicBarrier"></video>

* No código-exemplo, é criado uma barreira que aguarda 3 threads. Durante a execução, a barreira espera pela chegada de todas as threads. Quando todas chegam no ponto em comum, são liberadas. 

<br>

## 4. CountDownLatch

CountDownLatch é uma classe que permite as threads esperarem outras threads finalizarem suas tarefas. Ele recebe uma contagem inicial, que é decrementada conforme as atividades são finalizadas. Quando o contador chega a zero, todas as threads são liberadas.

<video controls src="static/CountDownLatch.mp4" title="CountDownLatch"></video>

* No código-exemplo, é criado um CountDownLatch com contador 3 e 3 threads. Assim que uma thread finaliza suas tarefas, o contador é decrementado. Quando chega em 0, o programa finaliza.

<br>

## 5. ConcurrentLinkedQueue

ConcurrentLinkedQueue é uma fila thread-safe e não bloqueante, baseada em nós encadeados. Ela permite que várias threads insiram e removam elementos simultaneamente sem travamentos.

<video controls src="static/ConcurrentLinkedQueue.mp4" title="ConcurrentLinkedQueue"></video>

* No código-exemplo, é possível ver algumas operações possíveis dentro de uma fila concorrente.

<br>

# Pontos fáceis e difíceis

| Pontos fáceis           | Pontos difíceis                  |
|-------------------------|----------------------------------|
| Compreender o conceito. | Criar exemplos que funcionassem. |

# Referências
https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/package-summary.html
https://gasparbarancelli.com/post/programacao-concorrente-com-semaforos-em-java-guia-pratico-para-iniciantes
https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Exchanger.html
https://gasparbarancelli.com/post/implementando-sincronizacao-de-threads-em-java-com-cyclicbarrier
https://gasparbarancelli.com/post/utilizando-countdownlatch-para-sincronizacao-de-threads-em-java
https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentLinkedQueue.html
