-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 17 Des 2022 pada 12.40
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pengarsipan_skripsi`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_data_dosen`
--

CREATE TABLE `t_data_dosen` (
  `id` int(11) NOT NULL,
  `nid` varchar(10) DEFAULT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_data_mahasiswa`
--

CREATE TABLE `t_data_mahasiswa` (
  `id` int(11) NOT NULL,
  `nim` varchar(10) DEFAULT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `jurusan` varchar(30) DEFAULT NULL,
  `angkatan` varchar(4) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_data_skripsi`
--

CREATE TABLE `t_data_skripsi` (
  `id` int(11) NOT NULL,
  `kode_skripsi` varchar(11) DEFAULT NULL,
  `judul` varchar(100) DEFAULT NULL,
  `nim` varchar(10) DEFAULT NULL,
  `nid` varchar(10) DEFAULT NULL,
  `tahun` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_kategori_skripsi`
--

CREATE TABLE `t_kategori_skripsi` (
  `id` int(11) NOT NULL,
  `kode_skripsi` varchar(11) DEFAULT NULL,
  `kategori_skripsi` varchar(30) DEFAULT NULL,
  `kategori_studi` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_petugas_tu`
--

CREATE TABLE `t_petugas_tu` (
  `id` int(11) NOT NULL,
  `nama_petugas` varchar(30) DEFAULT NULL,
  `nama_pengguna` varchar(30) DEFAULT NULL,
  `kata_sandi` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `t_data_dosen`
--
ALTER TABLE `t_data_dosen`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `t_data_mahasiswa`
--
ALTER TABLE `t_data_mahasiswa`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `t_data_skripsi`
--
ALTER TABLE `t_data_skripsi`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `t_kategori_skripsi`
--
ALTER TABLE `t_kategori_skripsi`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `t_petugas_tu`
--
ALTER TABLE `t_petugas_tu`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `t_data_dosen`
--
ALTER TABLE `t_data_dosen`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `t_data_mahasiswa`
--
ALTER TABLE `t_data_mahasiswa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT untuk tabel `t_data_skripsi`
--
ALTER TABLE `t_data_skripsi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `t_kategori_skripsi`
--
ALTER TABLE `t_kategori_skripsi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `t_petugas_tu`
--
ALTER TABLE `t_petugas_tu`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
