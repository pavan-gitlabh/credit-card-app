import React from "react";
import CardForm from "./CardForm";
import CardList from "./CardList";
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  return (
    <div className="container mt-5">
      <h2>Add Credit Card</h2>
      <CardForm />
      <hr />
      <CardList />
    </div>
  );
}

export default App;
