// src/services/ApiService.js
import axios from 'axios';

const API_BASE_URL = 'http://localhost:8080/api'; // Ensure this matches your actual backend API URL

export const fetchRecommendations = () => {
  return axios.get(`${API_BASE_URL}/recommendations`);
};

export default {
  fetchRecommendations,
};
