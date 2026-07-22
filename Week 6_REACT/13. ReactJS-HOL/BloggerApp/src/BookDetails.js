import React from "react";

function BookDetails() {
  const books = [
    { id: 1, name: "Java Programming", author: "James Gosling", price: 500 },
    { id: 2, name: "ReactJS", author: "Jordan Walke", price: 650 },
    { id: 3, name: "Python", author: "Guido van Rossum", price: 700 }
  ];

  return (
    <div>
      <h2>Book Details</h2>

      <ul>
        {books.map((book) => (
          <li key={book.id}>
            <b>{book.name}</b><br />
            Author : {book.author}<br />
            Price : ₹{book.price}
            <hr />
          </li>
        ))}
      </ul>
    </div>
  );
}

export default BookDetails;