package gmshop.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity

public class Customer {
@Id

@GeneratedValue(strategy = GenerationType.AUTO)
int customer_id;

@Column(name = "customer_lastName")
String lastName;

@Column(name="customer_firstName")
        @NotNull
String firstName;

        public int getCustomer_id() {
                return customer_id;
        }

        public void setCustomer_id(int customer_id) {
                this.customer_id = customer_id;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        @NotNull
        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(@NotNull String firstName) {
                this.firstName = firstName;
        }

        public long getContact() {
                return contact;
        }

        public void setContact(long contact) {
                this.contact = contact;
        }

        @Column(name="customer_constact")
long contact;


public Customer(){}

        @Override
        public String toString() {
                return "Customer{" +
                        "customer_id=" + customer_id +
                        ", lastName='" + lastName + '\'' +
                        ", firstName='" + firstName + '\'' +
                        ", contact=" + contact +
                        '}';
        }
}
