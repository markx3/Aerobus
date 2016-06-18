#Aerobus
##Descrição
Este trabalho consiste no construção de um programa de computador em Java
para implementar um sistema de reservas de passagens de uma empresa aérea.

##Detalhamento
###Os principais objetos envolvidos nessas regras são:  
* Cliente  
* Reserva de viagem  
* Reserva de vôo  
* Vôo  
* Descrição do vôo  
* Descrição do avião  
* Aeroporto  

* Considere que há dois tipos de clientes: Pessoas fı́sicas e Pessoas jurı́dicas.  
* Pessoas fı́sicas possuem CPF, nome, endereço, sexo(opcional), data de nascimento (opcional) e telefones (opcionais). Pessoas jurı́dicas possuem CNPJ,razão social, endereço e telefones (opcionais).  
* Um vôo possui: data de partida e número de vagas.  
* A descrição de um vôo possui: horário de partida; horário de chegada e número.  
* A descrição de um avião possui: nome do fabricante; número do modelo; número de assentos.  
* Um aeroporto possui: nome; código; nome da cidade em que fica localizado.  

###O sistema deve possibilitar:  
* Incluir, remover e editar clientes  
* Incluir, remover e editar vôos  
* Incluir, remover e editar descrições de vôos  
* Incluir, remover e editar descrições de aviões  
* Incluir, remover e editar aeroportos  
* Criar e remover uma reserva de viagem para um cliente  
* Incluir e remover reservas de vôos em uma reserva de viagem para um cliente  
* Obter os dados de um cliente a partir do número do seu CPF ou CNPJ  
* Obter os códigos das reservas de viagem a partir do número do CPF ou CNPJ de um cliente  
* A partir do código de uma reserva de viagem, obter os códigos dos vôos reservados  
* A partir do código de um vôo, obter o número de vagas disponı́veis  
* A partir do código de um vôo, obter a data de partida, o horário de partida e o horário de chegada  
* A partir do código de um vôo, obter a descrição do avião empregado  
* A partir das cidades de origem e de destino, obter os códigos dos vôos em uma determinada data  
* A partir do código de um vôo, obter os códigos e os nomes dos aeroportos de origem e de destino.  
* A partir do código de um aeroporto, obter o seu nome e a sua cidade.  
###O sistema possui as seguintes regras do negócio:  
* A um cliente podem estar associadas várias reservas de viagem   
* A uma reserva de viagem podem estar associados várias reservas de vôos  
* A uma reserva de vôo está associado um vôo  
* A um vôo está associada uma descrição do vôo  
* À descrição de um vôo estão associados os aeroportos de origem e de destino  
* À descrição de um vôo está associada a descrição do avião  
* Todos os vôos ocorrem uma vez para cada dia da semana  