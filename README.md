# KafkaExamples
A repository of Kafka Examples

Below are the versions of softwares used in Examples

#### Java - java-8-oracle
#### Scala - scala-2.11.8
#### Kafka - kafka_2.11-0.9.0.0
#### Zookeeper - zookeeper-3.4.8
#### Hadoop - hadoop-2.6.0
    

Download tarballs related to above versions from Apache Mirrors and place their extraction in **/home/hadoop/work** folder (assuming that you have already installed Hadoop in the mentioned folder) and update the .bashrc file accordingly 

To update .bashrc file use below command
    
    gedit ~/.bashrc

update bashrc file with the following info

    export SCALA_HOME=/home/hadoop/work/scala-2.11.8
    export PATH=$SCALA_HOME/bin:$PATH
    
    export ZOOKEEPER_HOME=/home/hadoop/work/zookeeper-3.4.8
    export PATH=$ZOOKEEPER_HOME/bin:$PATH
    
    export KAFKA_HOME=/home/hadoop/work/kafka_2.11-0.9.0.0
    export PATH=$KAFKA_HOME/bin:$PATH

NOTE: Kafka provides simple zookeeper configuration in ${KAFKA_HOME}/conf folder though a seperate zookeeper installation can be done setting up the Kafka cluster




