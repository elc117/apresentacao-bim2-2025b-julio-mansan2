# Outras classes relacionadas à programação concorrente em Java

## 1. Semaphore:

Um semáforo em programação concorrente é uma classe que mantém permissões, estas sendo concedidas às Threads que buscam acessar o recurso. Ou seja, se uma thread solicita uma permissão e o semáforo a possui, ela é concedida à thread. Do contrário, a thread fica bloqueada até que alguma permissão fique disponível.

https://github.com/user-attachments/assets/8897eaa8-a5c9-405d-818c-55bd77612baa

* No código-exemplo, são criadas 5 threads e um semáforo com 2 permissões. 2 threads "entram" no semáforo e o restante permanece bloqueado. Quando as permissões são liberadas novamente, a thread que estava bloqueada, entra no semáforo. Isso persiste até a finalização do programa.

<br>

## 2. Exchanger

Exchanger é uma classe que permite que duas threads troquem objetos de maneira síncrona. Funciona como um ponto de encontro, onde uma thread espera a chegada de outro e ambos "trocam" objetos entre si.

https://github.com/user-attachments/assets/fd377b8f-12c0-4484-b8c9-91007bb5d9b6

* No código-exemplo, são criadas 2 threads e um exchanger. A primeira thread envia sua mensagem e fica esperando a próxima thread. Quando a segunda thread envia a sua mensagem para o exchanger, ambas "trocam" e o programa finaliza.

<br>

## 3. CyclicBarrier

CyclicBarrier é uma classe de sincronização que permite que múltiplas threads esperem umas as outras para continuar a execução do programa.

https://github.com/user-attachments/assets/33fea4c7-0664-4035-be20-dc1f361929fa

* No código-exemplo, é criado uma barreira que aguarda 3 threads. Durante a execução, a barreira espera pela chegada de todas as threads. Quando todas chegam no ponto em comum, são liberadas. 

<br>

## 4. CountDownLatch

CountDownLatch é uma classe que permite as threads esperarem outras threads finalizarem suas tarefas. Ele recebe uma contagem inicial, que é decrementada conforme as atividades são finalizadas. Quando o contador chega a zero, todas as threads são liberadas.

https://github.com/user-attachments/assets/1cb355d2-8466-4ed2-84c9-1e3ac3cbb42a

* No código-exemplo, é criado um CountDownLatch com contador 3 e 3 threads. Assim que uma thread finaliza suas tarefas, o contador é decrementado. Quando chega em 0, o programa finaliza.

<br>

## 5. ConcurrentLinkedQueue

ConcurrentLinkedQueue é uma fila thread-safe e não bloqueante, baseada em nós encadeados. Ela permite que várias threads insiram e removam elementos simultaneamente sem travamentos.

https://github.com/user-attachments/assets/71a59328-7b74-4e2c-bc02-20469b52880f

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
