import React, { useState } from "react";
import axios from "axios";

function CardForm() {
  const [name, setName] = useState("");
  const [cardNumber, setCardNumber] = useState("");
  const [limit, setLimit] = useState("");
  const [error, setError] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await axios.post("/api/cards", { name, cardNumber, limit });
      setName("");
      setCardNumber("");
      setLimit("");
      setError("");
    } catch (err) {
      setError(err.response?.data || "Error adding card");
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      {error && <div className="alert alert-danger">{error}</div>}
      <div className="mb-3">
        <label>Name</label>
        <input className="form-control" value={name} onChange={e => setName(e.target.value)} required />
      </div>
      <div className="mb-3">
        <label>Card Number</label>
        <input className="form-control" value={cardNumber} onChange={e => setCardNumber(e.target.value)} required />
      </div>
      <div className="mb-3">
        <label>Limit (£)</label>
        <input className="form-control" type="number" value={limit} onChange={e => setLimit(e.target.value)} required />
      </div>
      <button className="btn btn-primary">Add</button>
    </form>
  );
}

export default CardForm;
