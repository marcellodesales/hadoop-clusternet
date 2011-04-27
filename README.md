# Hadoop Clusternet

> NOTE: Migrated from https://code.google.com/archive/p/hadoop-clusternet/ using https://gist.github.com/marcellodesales/2e87387cbd5866098766074895e7f3e9


If you've just started experimenting Hadoop and your experiments involve not more than 10 cluster nodes, I think you can keep reading...

While working in a skunkworks project to put experiment hadoop at work, I felt that the manual steps of setting up the cluster could be automated using Subversion and scripts... Setting up a cluster of two or more nodes involve pushing the same configuration from the master node to the slaves, as well as pushing the master SSH keys to the slaves, etc.

Started from a small project to use Hadoop, Hive and any other Hadoop tool, this project was developed to maintain the manual configurations of hadoop, hive, etc in Subversion, while automating the steps of configuration using ANT. If you plan to experiment Hadoop using manual steps of configuring the masters and slaves, you can use this project. Operating the hadoop cluster is done as usual.

By no means this project is intended to be used in larger clusters. I would suggest you to use Puppet or any other cluster node management system.
