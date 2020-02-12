# ShoppingList
<h3>CRUD Maven project</h3>
 <h4>Tools</h4>
<p>JSF - Bootstrap - Hibernate - JPA - MYSQL - Tomcat<p/>

 <h4>Purpose </h4>
 <p>
 This project is a part of my online documentation to keep solutions hand on. Anyone who need it can use it as he wish.
<p/>
<h4>Description</h4>
<p> It is about create a shopping list. Items belong to a category, fruit or vegtable. It is a many to one relation. You can add, delete or modify items on the list.</p>
<p>
In this project you will find a items list using a CRUD in a MVC pattern. Since controller is handle by the framework, I only coded the view and the model.<p/>
 <p>
 For data management I used annotations.
<p/>

<br /><br />
<h4>As  a picture is worth a thousand words.</h4>
<hr>

<b>Select All</b><br />
<img src="images/ShoppingList-select-all.png" height="300px;" target="_blank">


<b>Insert</b><br /><br />
<img src="images/ShoppingList-insert.png" height="300px;" target="_blank">


<b>Update</b><br /><br />
<img src="images/ShoppingList-update.png" height="300px;" target="_blank">


<b>Delete confirmation</b><br /><br />
<img src="images/ShoppingList-delete-confirme.png" height="150px;" target="_blank">


<b>Date fields</b><br /><br />
<img src="images/ShoppingList-datepicker.png" height="300px;" target="_blank">
<br /><br />


MYSQL QUERIES
<hr>
CREATE SCHEMA `shopping_list` ;
<br /><br />
CREATE USER 'test'@'localhost' IDENTIFIED BY 'pass';<br />
GRANT ALL PRIVILEGES ON shopping_list.* TO 'test'@'localhost';<br />
<br />
CREATE TABLE `shopping_list`.`category` (<br />
  `id` INT NOT NULL AUTO_INCREMENT,<br />
  `name` VARCHAR(100) NULL,<br />
  PRIMARY KEY (`id`));<br />
  <br />
insert into category (name) values ("fruit");<br />
insert into category (name) values ("vegtables");<br />
<br />
CREATE TABLE `shopping_list`.`item` (<br />
  `id` INT NOT NULL AUTO_INCREMENT,<br />
  `name` VARCHAR(100) NOT NULL,<br />
  `creation_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,<br />
  `modification_date` TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP,<br />
  `price` DECIMAL(19,2) NULL,<br />
  `category_id` VARCHAR(45) NOT NULL,<br />
  PRIMARY KEY (`id`));<br />
  <br />
insert into item (name,modification_date,price,category_id) values ("apple",now(),0.5,1);<br />
insert into item (name,modification_date,price,category_id) values ("strawberry",now(),0.1,1);<br />
insert into item (name,modification_date,price,category_id) values ("cherry",now(),0.1,1);<br />
insert into item (name,modification_date,price,category_id) values ("grapefruit",now(),0.5,1);<br />
insert into item (name,modification_date,price,category_id) values ("lemon",now(),0.7,1);<br />
<br />
insert into item (name,modification_date,price,category_id) values ("carrot",now(),0.5,2);<br />
insert into item (name,modification_date,price,category_id) values ("onion",now(),0.3,2);<br />
insert into item (name,modification_date,price,category_id) values ("potato",now(),0.2,2);<br />
insert into item (name,modification_date,price,category_id) values ("green bean",now(),0.01,2);<br />
insert into item (name,modification_date,price,category_id) values ("corn",now(),0.6,2);<br />
<br /><br /><br />


> <p><b>Feel free to ask me questions, it will be a pleasure to answer you.</b></p>
