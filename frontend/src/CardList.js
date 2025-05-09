import React, { useEffect, useState } from "react";
import axios from "axios";
const API_HOST = "http://localhost:8080";
axios.defaults.baseURL = API_HOST;

function CardList() {
  const [cards, setCards] = useState([]);

  useEffect(() => {
    fetchCards();
  }, []);

  const fetchCards = async () => {
    const res = await axios.get("/api/cards");
    setCards(res.data);
  };

  return (
    <div>
      <h3>Existing Cards</h3>
      <table className="table">
        <thead>
          <tr>
            <th>Name</th>
            <th>Card Number</th>
            <th>Limit (£)</th>
            <th>Balance (£)</th>
          </tr>
        </thead>
        <tbody>
          {cards.map(card => (
            <tr key={card.id}>
              <td>{card.name}</td>
              <td>{card.cardNumber}</td>
              <td>{card.limit}</td>
              <td>{card.balance}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default CardList;
